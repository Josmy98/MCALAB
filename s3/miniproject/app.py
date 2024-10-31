from flask import Flask, request, jsonify, render_template
from joblib import load
import numpy as np  # Import NumPy for array manipulations if needed

app = Flask(__name__)

# Load the pre-trained model and CountVectorizer
model = load('stress_model.joblib')
cv = load('count_vectorizer.joblib')

def predict_stress(text):
    # Transform the input text using the CountVectorizer
    df = cv.transform([text]).toarray()
    # Make prediction and get probabilities
    output = model.predict(df)
    probabilities = model.predict_proba(df)
    
    return output[0], probabilities

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/predict', methods=['POST'])
def predict():
    text = request.form.get('text')
    
    if not text:
        return jsonify({"error": "No text provided"}), 400  # Return an error if no text is given
    
    stress_level, probabilities = predict_stress(text)
    print(stress_level)

    if stress_level == 1:  # Assuming '1' indicates stress
        confidence = np.max(probabilities)  # Get the highest probability as confidence
        return jsonify({"stress_level": "Stress", "confidence": confidence})
    else:
        return jsonify({"stress_level": "No Stress"})

if __name__ == '__main__':
    app.run(debug=True)

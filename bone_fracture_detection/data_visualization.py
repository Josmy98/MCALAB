import os
import cv2
import glob
import matplotlib.pyplot as plt

# Path to the dataset
dataset_path = "C:/Users/arung/Desktop/Fracture Detection/Dataset/train_valid/Elbow/"

# Recursively find all image files inside patient/study folders
image_paths = glob.glob(os.path.join(dataset_path, "**", "**", "**", "*.png"), recursive=True)

# Check if images were found
if not image_paths:
    print("⚠️ No images found! Check the dataset path or file extensions.")
else:
    print(f"✅ Found {len(image_paths)} images.")

    # Load and display a few images
    fig, axes = plt.subplots(1, 5, figsize=(15, 5))
    fig.suptitle("Bone Fracture Image Samples", fontsize=16)

    for i in range(min(5, len(image_paths))):  # Show up to 5 images
        img = cv2.imread(image_paths[i])
        img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)  # Convert BGR to RGB
        
        axes[i].imshow(img)
        axes[i].axis("off")
        axes[i].set_title(f"Image {i+1}")

    plt.show()

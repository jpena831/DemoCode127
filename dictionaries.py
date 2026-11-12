# 1. Creating a dictionary called student with key-value pairs
student = {
    "name": "Alex",
    "age": 21,
    "major": "Computer Science",
    "enrolled": True
}

# 2. Accessing values using keys
print("Student Name:", student["name"])
print("Major:", student.get("major"))  # .get() is safer if the key might not exist

# 3. Adding a new key-value pair and updating an existing one
student["gpa"] = 3.85          # Adds a new key 'gpa'
student["age"] = 22            # Updates 'age' from 21 to 22

# 4. Removing a key-value pair
removed_status = student.pop("enrolled")
print(f"Removed enrollment status: {removed_status}")

# 5. Iterating through a dictionary (keys and values)
print("\nUpdated Student Profile:")
for key, value in student.items():
    print(f"- {key}: {value}")
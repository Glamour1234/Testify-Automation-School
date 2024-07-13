# Dictionary
animals = {
    "bird": "parrot",
    "mammal": "cow",
    "fish": "hake"
}
print("dictionary:", animals)

#update
animals.update({"reptile": "snake", "mammal": "goat", "insect": "ant"})
print("update:", animals)

#pop - removes the last key value pair item
animals.popitem()
print("popitem:", animals)

#pop - removes a key value pair
animals.pop("mammal")
print("pop:", animals)

#copy - return a copy of a dictionary
animals.copy()
print("copy:", animals)

#clear
animals.clear()
print("clear:", animals)











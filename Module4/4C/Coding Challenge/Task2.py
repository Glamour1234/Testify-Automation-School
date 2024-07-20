# Create a length converter function

def length_converter(value, from_unit, to_unit):
        conversion_factors = {
            'millimeter': 0.001,
            'centimeter': 0.01,
            'meter': 1,
            'kilometer': 1000,
            'inch': 0.0254,
            'foot': 0.3048,
            'yard': 0.9144,
            'mile': 1609.34
        }
        # Convert the value to meters first
        value_in_meters = value * conversion_factors[from_unit]
        # Convert from meters to the target unit
        converted_value = value_in_meters / conversion_factors[to_unit]
        return converted_value


length_in_feet = length_converter(1000, 'meter', 'centimeter')
print("1000 meters in centimeter:", length_in_feet)

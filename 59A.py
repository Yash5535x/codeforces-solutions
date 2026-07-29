s = input()

# Count uppercase and lowercase
upper_count = sum(1 for ch in s if ch.isupper())
lower_count = sum(1 for ch in s if ch.islower())

if(upper_count>lower_count):
    print(s.upper())
else:
    print(s.lower())

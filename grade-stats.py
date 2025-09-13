def main():
    grades = []
    count = 0

    while count < 10:
        try:
            grade = float(input(f"Enter grade #{count + 1}: "))
            grades.append(grade)
            count += 1
        except ValueError:
            print("Invalid input. Please enter a numeric grade.")

    average = sum(grades) / len(grades)
    maximum = max(grades)
    minimum = min(grades)

    print("\n📊 Grade Statistics:")
    print(f"Average Grade: {average:.2f}")
    print(f"Highest Grade: {maximum:.2f}")
    print(f"Lowest Grade: {minimum:.2f}")

if __name__ == "__main__":
    main()
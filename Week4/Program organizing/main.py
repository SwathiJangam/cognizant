from text_processing_tool import count_words, find_unique_words, convert_to_uppercase

def main():
    text = input("Enter a text string: ")

    word_count = count_words(text)
    unique_words = find_unique_words(text)
    uppercase_text = convert_to_uppercase(text)

    print(f"Number of words: {word_count}")
    print(f"Unique words: {unique_words}")
    print(f"Uppercase text: {uppercase_text}")

if __name__ == "__main__":
    main()

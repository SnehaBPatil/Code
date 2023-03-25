class Solution:
    def arrangeWords(self, text: str) -> str:
        text=text.lower()
        text=list(text.split(" "))

        text.sort(key=lambda el: len(el))
        text=str(" ".join(text))
        text=text.capitalize()
        return text

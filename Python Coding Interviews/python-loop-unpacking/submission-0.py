from typing import List, Tuple


def best_student(scores: List[Tuple[str, int]]) -> str:
    max_score = 0
    max_scorer_name = ""
    for name, score in scores:
        max_score = max(max_score, score)
        if max_score == score:
            max_scorer_name = name

    return max_scorer_name


# do not modify below this line
print(best_student([("Alice", 90), ("Bob", 80), ("Charlie", 70)]))
print(best_student([("Alice", 90), ("Bob", 80), ("Charlie", 100)]))
print(best_student([("Alice", 90), ("Bob", 100), ("Charlie", 70)]))
print(best_student([("Alice", 90), ("Bob", 90), ("Charlie", 80), ("David", 100)]))

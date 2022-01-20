#!/usr/bin/env python
# -*- coding: utf-8 -*-

import json

book = []

for i in range(1, 7):
    book.append({"book_id":i,"book_name":"book%d"%i,"book_author":i,"book_page":100-i})

with open(r"C:\Users\Kit.Lam\Documents\Bootcamp\Perficient-tech-bootcamp\techbootcamp-kit\src\main\resources\book.json","w") as f:
    json.dump(book, f, indent=4)

f.close()
print("done")

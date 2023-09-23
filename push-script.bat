git add --all
git diff-index --quiet HEAD || git commit -m "scheduled commit"
git push origin
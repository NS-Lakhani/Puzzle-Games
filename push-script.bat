e:
cd E:\Code\STS_Workspace\Puzzle-Games
git add --all
git diff-index --quiet HEAD || git commit -m "scheduled commit"
git push origin
exit
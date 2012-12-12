This repo was created to play arround Git.
You can read this arrticle first http://nvie.com/posts/a-successful-git-branching-model/

A task is to complete implementation of MyList class.

What you need to do:
1) Clone *develop* branch to your local dev workspase
$ mkdir develop
$ cd develop
$ git clone -b develop -- https://github.com/mbryzhko/sandbox.git .
$ git branch
* develop

2) Create *feature* branch. Please choose some unique name for your feature. For instance name of test.
$ git checkout -b myfeature develop

do some changes...

$ git status

check your upcommitted changes

$ git add 
$ git commit -m "comment"

3) Cncorporating a finished feature on develop
$ git checkout develop
Switched to branch 'develop'

$ git merge --no-ff myfeature
$ git status
See that your local repo of *develop* branch is ahead of 'origin/develop'

$ git branch -d myfeature
$ git push origin develop

4) Check jenkins
https://buildhive.cloudbees.com/job/mbryzhko/job/sandbox/

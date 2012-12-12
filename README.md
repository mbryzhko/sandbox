This repo was created to play arround Git.
You can read this arrticle first http://nvie.com/posts/a-successful-git-branching-model/

A task is to complete implementation of MyList class.

What you need to do:<br>
1) Clone <b>develop</b> branch to your local dev workspase<br>
<code>
$ mkdir develop<br>
$ cd develop<br>
$ git clone -b develop -- https://github.com/mbryzhko/sandbox.git .<br>
$ git branch<br>
</code>

2) Create *feature* branch. Please choose some unique name for your feature. For instance name of test.<br/>
<code>$ git checkout -b myfeature develop</code>

do some changes...

<code>$ git status</code>

check your upcommitted changes

<code>$ git add<br> 
$ git commit -m "comment"</code>

3) Incorporating a finished feature on develop<br>
<code>$ git checkout develop</code><br>
Switched to branch 'develop'

<code>$ git merge --no-ff myfeature<br>
$ git status</code><br>
See that your local repo of *develop* branch is ahead of 'origin/develop'<br>

<code>$ git branch -d myfeature<br>
$ git push origin develop</code>

4) Check jenkins<br>
https://buildhive.cloudbees.com/job/mbryzhko/job/sandbox/

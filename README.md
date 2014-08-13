sbt-template
============

A very simple Scala/SBT project skeleton generator, written to suit my own
needs (it basically does a `cp` with some predefined files). For a full
featured and customizable template generator, you should consider using
[giter8](https://github.com/n8han/giter8) instead.

#### Installation

    git clone https://github.com/agjacome/sbt-template.git
    cd sbt-template
    chmod +x sbt-template

#### Example usage

    $ ./sbt-template -msg ~/src/tmp/sbt-template-example
    $ ls -a1 ~/src/tmp/sbt-template-example
    .git
    project
    src
    .gitignore
    README.md
    build.sbt
    sbt
    scalariform.sbt
    version.sbt
    wartremover.sbt

#### Help (sbt-template -h)

    Usage: sbt-template [options] [path-of-project]

    sbt-template will create a basic Scala SBT project in the path given by
    'path-of-project'. If none is given, it will default to the current path.

    After a successful execution, the path of the project will contain a basic
    directory hierarchy and some prepopulated settings, dependencies and plugins
    for SBT. It can also create the full path to the project, initialize a new git
    repository, download an alternative SBT script, and create a tmuxinator
    project.

    Available options:
        -h print this message
        -m create path to project if does not exist (do a 'mkdir -p')
        -g initialize a git repository in path (do a 'git init')
        -s download Paul Phillips' sbt runner (https://github.com/paulp/sbt-extras)
        -t create tmuxinator project (in '~/.tmuxinator/projectname.yml')


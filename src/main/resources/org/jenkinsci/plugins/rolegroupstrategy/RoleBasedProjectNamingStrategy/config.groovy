package org.jenkinsci.plugins.rolegroupstrategy.RoleBasedProjectNamingStrategy

def f=namespace(lib.FormTagLib)

f.entry(title:_("forceExistingJobs"), field:"forceExistingJobs") {
    f.checkbox(name:"forceExistingJobs")
}

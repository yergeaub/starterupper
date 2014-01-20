package com.joeylawrance.starterupper.model.host.impl;

import com.joeylawrance.starterupper.model.host.GenericGitHostRepository;
import com.joeylawrance.starterupper.model.host.GenericHost;

public class Bitbucket extends GenericGitHostRepository {

	public Bitbucket() {
		super("Bitbucket", Bitbucket.class.getResource("/bitbucket.png"), "Bitbucket hosts unlimited free private git repositories.");
		setHost("bitbucket.org");
		setURL(GenericHost.HostAction.login,"https://bitbucket.org/account/signin/");
		setURL(GenericHost.HostAction.profile,"https://bitbucket.org/%s");
		setURL(GenericHost.HostAction.logout,"https://bitbucket.org/account/signout/");
		setURL(GenericHost.HostAction.signup,"https://bitbucket.org/account/signup/");
		setURL(GenericHost.HostAction.reset,"https://bitbucket.org/account/password/reset/");
		setRepositoryCreateURL("https://bitbucket.org/repo/create");
		setCollaboratorURL("https://bitbucket.org/%s/%s/admin/access");
	}
	
	@Override
	public void setUsername(String username) {
		super.setUsername(username);
		setPublicKeyURL(String.format("https://bitbucket.org/account/user/%s/ssh-keys/", username));
	}
}

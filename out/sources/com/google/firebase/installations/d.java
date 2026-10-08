package com.google.firebase.installations;

import vk.j;

/* JADX INFO: loaded from: classes4.dex */
public class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f36423a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f36423a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f36423a = aVar;
    }
}

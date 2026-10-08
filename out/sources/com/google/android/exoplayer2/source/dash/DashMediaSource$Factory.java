package com.google.android.exoplayer2.source.dash;

import ag.c;
import of.b;
import sf.a;

/* JADX INFO: loaded from: classes3.dex */
public final class DashMediaSource$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f28879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f28880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qf.a f28881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f28882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f28883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f28884f;

    public DashMediaSource$Factory(ag.a aVar) {
        this(new sf.b(aVar), aVar);
    }

    public DashMediaSource$Factory(a aVar, ag.a aVar2) {
        this.f28879a = (a) bg.a.b(aVar);
        this.f28880b = new of.a();
        this.f28882d = new ag.b();
        this.f28883e = 30000L;
        this.f28884f = 5000000L;
        this.f28881c = new qf.b();
    }
}

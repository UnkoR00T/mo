package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class k80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f32709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d90 f32710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u90 f32711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s80 f32712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f32713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i40 f32714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Executor f32715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i80 f32716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y80 f32717i;

    k80() {
    }

    public final k80 a(int i15) {
        this.f32709a = 443;
        return this;
    }

    public final k80 b(d90 d90Var) {
        this.f32710b = (d90) zj.p.q(d90Var);
        return this;
    }

    public final k80 c(u90 u90Var) {
        this.f32711c = (u90) zj.p.q(u90Var);
        return this;
    }

    public final k80 d(ScheduledExecutorService scheduledExecutorService) {
        this.f32713e = (ScheduledExecutorService) zj.p.q(scheduledExecutorService);
        return this;
    }

    public final k80 e(s80 s80Var) {
        this.f32712d = (s80) zj.p.q(s80Var);
        return this;
    }

    public final k80 f(i40 i40Var) {
        this.f32714f = (i40) zj.p.q(i40Var);
        return this;
    }

    public final k80 g(Executor executor) {
        this.f32715g = executor;
        return this;
    }

    public final k80 h(i80 i80Var) {
        this.f32716h = i80Var;
        return this;
    }

    public final k80 i(y80 y80Var) {
        this.f32717i = y80Var;
        return this;
    }

    public final l80 j() {
        return new l80(this, null);
    }

    final /* synthetic */ Integer k() {
        return this.f32709a;
    }

    final /* synthetic */ d90 l() {
        return this.f32710b;
    }

    final /* synthetic */ u90 m() {
        return this.f32711c;
    }

    final /* synthetic */ s80 n() {
        return this.f32712d;
    }

    final /* synthetic */ ScheduledExecutorService o() {
        return this.f32713e;
    }

    final /* synthetic */ i40 p() {
        return this.f32714f;
    }

    final /* synthetic */ Executor q() {
        return this.f32715g;
    }

    final /* synthetic */ i80 r() {
        return this.f32716h;
    }

    final /* synthetic */ y80 s() {
        return this.f32717i;
    }
}

package fr;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements mr.b, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f66389g = a.f66396a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient mr.b f66390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f66391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f66392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f66393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f66394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f66395f;

    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f66396a = new a();

        private a() {
        }
    }

    protected f(Object obj, Class cls, String str, String str2, boolean z15) {
        this.f66391b = obj;
        this.f66392c = cls;
        this.f66393d = str;
        this.f66394e = str2;
        this.f66395f = z15;
    }

    public mr.b c() {
        mr.b bVar = this.f66390a;
        if (bVar != null) {
            return bVar;
        }
        mr.b bVarE = e();
        this.f66390a = bVarE;
        return bVarE;
    }

    protected abstract mr.b e();

    @Override // mr.b
    public mr.p f() {
        return m().f();
    }

    @Override // mr.b
    public String getName() {
        return this.f66393d;
    }

    @Override // mr.b
    public List<mr.k> getParameters() {
        return m().getParameters();
    }

    public Object h() {
        return this.f66391b;
    }

    public mr.f i() {
        Class cls = this.f66392c;
        if (cls == null) {
            return null;
        }
        return this.f66395f ? q0.d(cls) : q0.c(cls);
    }

    protected mr.b m() {
        mr.b bVarC = c();
        if (bVarC != this) {
            return bVarC;
        }
        throw new dr.b();
    }

    public String r() {
        return this.f66394e;
    }
}

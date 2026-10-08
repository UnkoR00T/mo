package ot;

import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws.d f149819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ws.h f149820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h1 f149821c;

    public static final class a extends o0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final us.c f149822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f149823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final zs.b f149824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final us.c.EnumC5226c f149825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f149826h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f149827i;

        public a(us.c cVar, ws.d dVar, ws.h hVar, h1 h1Var, a aVar) {
            super(dVar, hVar, h1Var, null);
            this.f149822d = cVar;
            this.f149823e = aVar;
            this.f149824f = m0.a(dVar, cVar.O0());
            us.c.EnumC5226c enumC5226cD = ws.b.f214724f.d(cVar.N0());
            this.f149825g = enumC5226cD == null ? us.c.EnumC5226c.CLASS : enumC5226cD;
            this.f149826h = ws.b.f214725g.d(cVar.N0()).booleanValue();
            this.f149827i = ws.b.f214726h.d(cVar.N0()).booleanValue();
        }

        @Override // ot.o0
        public zs.c a() {
            return this.f149824f.a();
        }

        public final zs.b e() {
            return this.f149824f;
        }

        public final us.c f() {
            return this.f149822d;
        }

        public final us.c.EnumC5226c g() {
            return this.f149825g;
        }

        public final a h() {
            return this.f149823e;
        }

        public final boolean i() {
            return this.f149826h;
        }
    }

    public static final class b extends o0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final zs.c f149828d;

        public b(zs.c cVar, ws.d dVar, ws.h hVar, h1 h1Var) {
            super(dVar, hVar, h1Var, null);
            this.f149828d = cVar;
        }

        @Override // ot.o0
        public zs.c a() {
            return this.f149828d;
        }
    }

    public /* synthetic */ o0(ws.d dVar, ws.h hVar, h1 h1Var, fr.k kVar) {
        this(dVar, hVar, h1Var);
    }

    public abstract zs.c a();

    public final ws.d b() {
        return this.f149819a;
    }

    public final h1 c() {
        return this.f149821c;
    }

    public final ws.h d() {
        return this.f149820b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private o0(ws.d dVar, ws.h hVar, h1 h1Var) {
        this.f149819a = dVar;
        this.f149820b = hVar;
        this.f149821c = h1Var;
    }
}

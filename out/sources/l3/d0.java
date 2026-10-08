package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Ll3/d0;", "", "<init>", "()V", "Ll3/g;", "focusDirection", "", "e", "(I)Z", "Ln2/c;", "Ll3/h0;", "a", "Ln2/c;", "d", "()Ln2/c;", "focusRequesterNodes", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d0 f115557c = new d0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d0 f115558d = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d0 f115559e = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n2.c<h0> focusRequesterNodes = new n2.c<>(new h0[16], 0);

    /* JADX INFO: renamed from: l3.d0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Ll3/d0$a;", "", "<init>", "()V", "Ll3/d0$a$a;", "a", "()Ll3/d0$a$a;", "Ll3/d0;", "Default", "Ll3/d0;", "c", "()Ll3/d0;", "Cancel", "b", "Redirect", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: l3.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Ll3/d0$a$a;", "", "<init>", "()V", "Ll3/d0;", "a", "()Ll3/d0;", "b", "c", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2787a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2787a f115561a = new C2787a();

            private C2787a() {
            }

            public final d0 a() {
                return new d0();
            }

            public final d0 b() {
                return new d0();
            }

            public final d0 c() {
                return new d0();
            }

            public final d0 d() {
                return new d0();
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final C2787a a() {
            return C2787a.f115561a;
        }

        public final d0 b() {
            return d0.f115558d;
        }

        public final d0 c() {
            return d0.f115557c;
        }

        public final d0 d() {
            return d0.f115559e;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ boolean f(d0 d0Var, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = g.INSTANCE.b();
        }
        return d0Var.e(i15);
    }

    public final n2.c<h0> d() {
        return this.focusRequesterNodes;
    }

    public final boolean e(int focusDirection) {
        Companion companion = INSTANCE;
        if (this == companion.c()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == companion.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (d().getSize() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        n2.c<h0> cVarD = d();
        h0[] h0VarArr = cVarD.content;
        int iO = cVarD.getSize();
        boolean z15 = false;
        for (int i15 = 0; i15 < iO; i15++) {
            h0 h0Var = h0VarArr[i15];
            int iA = g4.s0.a(1024);
            if (!h0Var.getNode().getIsAttached()) {
                d4.a.c("visitChildren called on an unattached node");
            }
            n2.c cVar = new n2.c(new f3.m.c[16], 0);
            f3.m.c child = h0Var.getNode().getChild();
            if (child == null) {
                g4.h.c(cVar, h0Var.getNode(), false);
            } else {
                cVar.d(child);
            }
            while (cVar.getSize() != 0) {
                f3.m.c cVarL = (f3.m.c) cVar.v(cVar.getSize() - 1);
                if ((cVarL.getAggregateChildKindSet() & iA) == 0) {
                    g4.h.c(cVar, cVarL, false);
                } else {
                    while (cVarL != null) {
                        if ((cVarL.getKindSet() & iA) != 0) {
                            n2.c cVar2 = null;
                            while (cVarL != null) {
                                if (cVarL instanceof p0) {
                                    if (((p0) cVarL).Q(focusDirection)) {
                                        z15 = true;
                                        break;
                                    }
                                } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                    int i16 = 0;
                                    for (f3.m.c cVarO3 = ((g4.j) cVarL).getDelegate(); cVarO3 != null; cVarO3 = cVarO3.getChild()) {
                                        if ((cVarO3.getKindSet() & iA) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                cVarL = cVarO3;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new n2.c(new f3.m.c[16], 0);
                                                }
                                                if (cVarL != null) {
                                                    cVar2.d(cVarL);
                                                    cVarL = null;
                                                }
                                                cVar2.d(cVarO3);
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                cVarL = g4.h.l(cVar2);
                            }
                            break;
                        }
                        cVarL = cVarL.getChild();
                    }
                }
            }
        }
        return z15;
    }
}

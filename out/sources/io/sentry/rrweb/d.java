package io.sentry.rrweb;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.util.v;
import io.sentry.v0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f95624c;

    public static final class a {
        public boolean a(d dVar, String str, k3 k3Var, v0 v0Var) {
            if (!str.equals("source")) {
                return false;
            }
            dVar.f95624c = (b) v.c((b) k3Var.M1(v0Var, new b.a()), "");
            return true;
        }
    }

    public enum b implements d2 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        public static final class a implements t1<b> {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(k3 k3Var, v0 v0Var) {
                return b.values()[k3Var.nextInt()];
            }
        }

        @Override // io.sentry.d2
        public void serialize(l3 l3Var, v0 v0Var) {
            l3Var.b(ordinal());
        }
    }

    public static final class c {
        public void a(d dVar, l3 l3Var, v0 v0Var) {
            l3Var.f("source").l(v0Var, dVar.f95624c);
        }
    }

    public d(b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f95624c = bVar;
    }
}

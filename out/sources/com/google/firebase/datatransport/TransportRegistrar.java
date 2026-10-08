package com.google.firebase.datatransport;

import af.t;
import android.content.Context;
import androidx.annotation.Keep;
import bl.b;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import tl.h;
import ye.i;
import yk.c;
import yk.d;
import yk.d0;
import yk.g;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f28861g);
    }

    public static /* synthetic */ i b(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f28862h);
    }

    public static /* synthetic */ i c(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f28862h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(i.class).g(LIBRARY_NAME).b(q.j(Context.class)).e(new g() { // from class: bl.c
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return TransportRegistrar.c(dVar);
            }
        }).d(), c.e(d0.a(bl.a.class, i.class)).b(q.j(Context.class)).e(new g() { // from class: bl.d
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return TransportRegistrar.b(dVar);
            }
        }).d(), c.e(d0.a(b.class, i.class)).b(q.j(Context.class)).e(new g() { // from class: bl.e
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return TransportRegistrar.a(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "18.2.0"));
    }
}

package com.google.mlkit.vision.text.internal;

import an.s;
import an.t;
import com.google.firebase.components.ComponentRegistrar;
import fh.m0;
import java.util.List;
import pm.d;
import pm.i;
import yk.c;
import yk.g;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return m0.n(c.c(t.class).b(q.j(i.class)).e(new g() { // from class: an.w
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new t((pm.i) dVar.a(pm.i.class));
            }
        }).d(), c.c(s.class).b(q.j(t.class)).b(q.j(d.class)).e(new g() { // from class: an.x
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new s((t) dVar.a(t.class), (pm.d) dVar.a(pm.d.class));
            }
        }).d());
    }
}

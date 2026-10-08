package com.google.mlkit.vision.barcode.internal;

import ch.i1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import pm.d;
import pm.i;
import um.f;
import um.h;
import yk.c;
import yk.g;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return i1.n(c.c(h.class).b(q.j(i.class)).e(new g() { // from class: um.c
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new h((pm.i) dVar.a(pm.i.class));
            }
        }).d(), c.c(f.class).b(q.j(h.class)).b(q.j(d.class)).b(q.j(i.class)).e(new g() { // from class: um.d
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new f((h) dVar.a(h.class), (pm.d) dVar.a(pm.d.class), (pm.i) dVar.a(pm.i.class));
            }
        }).d());
    }
}

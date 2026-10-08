package com.google.mlkit.vision.face.internal;

import com.google.firebase.components.ComponentRegistrar;
import eh.p0;
import java.util.List;
import pm.i;
import yk.c;
import yk.g;
import yk.q;
import ym.d;
import ym.f;

/* JADX INFO: loaded from: classes4.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return p0.n(c.c(f.class).b(q.j(i.class)).e(new g() { // from class: ym.l
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new f((pm.i) dVar.a(pm.i.class));
            }
        }).d(), c.c(d.class).b(q.j(f.class)).b(q.j(pm.d.class)).e(new g() { // from class: ym.m
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new d((f) dVar.a(f.class), (pm.d) dVar.a(pm.d.class));
            }
        }).d());
    }
}

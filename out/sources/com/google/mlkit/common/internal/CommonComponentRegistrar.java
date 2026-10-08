package com.google.mlkit.common.internal;

import bh.f;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import pm.a;
import pm.d;
import pm.i;
import pm.j;
import pm.n;
import qm.b;
import yk.c;
import yk.g;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return f.n(n.f160874b, c.c(b.class).b(q.j(i.class)).e(new g() { // from class: mm.a
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new qm.b((i) dVar.a(i.class));
            }
        }).d(), c.c(j.class).e(new g() { // from class: mm.b
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new j();
            }
        }).d(), c.c(om.c.class).b(q.m(om.c.a.class)).e(new g() { // from class: mm.c
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new om.c(dVar.c(om.c.a.class));
            }
        }).d(), c.c(d.class).b(q.l(j.class)).e(new g() { // from class: mm.d
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new pm.d(dVar.d(j.class));
            }
        }).d(), c.c(a.class).e(new g() { // from class: mm.e
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return pm.a.a();
            }
        }).d(), c.c(pm.b.class).b(q.j(a.class)).e(new g() { // from class: mm.f
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new pm.b((pm.a) dVar.a(pm.a.class));
            }
        }).d(), c.c(nm.a.class).b(q.j(i.class)).e(new g() { // from class: mm.g
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new nm.a((i) dVar.a(i.class));
            }
        }).d(), c.m(om.c.a.class).b(q.l(nm.a.class)).e(new g() { // from class: mm.h
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return new om.c.a(om.a.class, dVar.d(nm.a.class));
            }
        }).d());
    }
}

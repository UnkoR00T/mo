package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import dh.mc;
import java.util.List;
import yk.c;
import yk.d;
import yk.g;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return mc.n(c.c(a.class).b(q.m(a.C0768a.class)).e(new g() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // yk.g
            public final Object a(d dVar) {
                return new a(dVar.c(a.C0768a.class));
            }
        }).d());
    }
}

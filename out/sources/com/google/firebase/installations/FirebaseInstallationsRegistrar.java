package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import yk.d0;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ ll.e a(yk.d dVar) {
        return new c((vk.e) dVar.a(vk.e.class), dVar.d(il.i.class), (ExecutorService) dVar.b(d0.a(xk.a.class, ExecutorService.class)), zk.i.a((Executor) dVar.b(d0.a(xk.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yk.c<?>> getComponents() {
        return Arrays.asList(yk.c.c(ll.e.class).g(LIBRARY_NAME).b(q.j(vk.e.class)).b(q.h(il.i.class)).b(q.k(d0.a(xk.a.class, ExecutorService.class))).b(q.k(d0.a(xk.b.class, Executor.class))).e(new yk.g() { // from class: ll.f
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return FirebaseInstallationsRegistrar.a(dVar);
            }
        }).d(), il.h.a(), tl.h.b(LIBRARY_NAME, "19.1.0"));
    }
}

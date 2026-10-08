package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(yk.d0 d0Var, yk.d dVar) {
        return new FirebaseMessaging((vk.e) dVar.a(vk.e.class), (jl.a) dVar.a(jl.a.class), dVar.d(tl.i.class), dVar.d(il.j.class), (ll.e) dVar.a(ll.e.class), dVar.g(d0Var), (hl.d) dVar.a(hl.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<yk.c<?>> getComponents() {
        final yk.d0 d0VarA = yk.d0.a(bl.b.class, ye.i.class);
        return Arrays.asList(yk.c.c(FirebaseMessaging.class).g(LIBRARY_NAME).b(yk.q.j(vk.e.class)).b(yk.q.g(jl.a.class)).b(yk.q.h(tl.i.class)).b(yk.q.h(il.j.class)).b(yk.q.j(ll.e.class)).b(yk.q.i(d0VarA)).b(yk.q.j(hl.d.class)).e(new yk.g() { // from class: com.google.firebase.messaging.b0
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return FirebaseMessagingRegistrar.a(d0VarA, dVar);
            }
        }).c().d(), tl.h.b(LIBRARY_NAME, "25.0.1"));
    }
}

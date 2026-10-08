package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import ju.l0;
import ju.v1;
import p071kotlin.Metadata;
import pq.v;
import yk.d0;
import yk.g;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lyk/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f36340a = new a<>();

        @Override // yk.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l0 a(yk.d dVar) {
            return v1.b((Executor) dVar.b(d0.a(xk.a.class, Executor.class)));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f36341a = new b<>();

        @Override // yk.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l0 a(yk.d dVar) {
            return v1.b((Executor) dVar.b(d0.a(xk.c.class, Executor.class)));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f36342a = new c<>();

        @Override // yk.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l0 a(yk.d dVar) {
            return v1.b((Executor) dVar.b(d0.a(xk.b.class, Executor.class)));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T> f36343a = new d<>();

        @Override // yk.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l0 a(yk.d dVar) {
            return v1.b((Executor) dVar.b(d0.a(xk.d.class, Executor.class)));
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yk.c<?>> getComponents() {
        return v.q(yk.c.e(d0.a(xk.a.class, l0.class)).b(q.k(d0.a(xk.a.class, Executor.class))).e(a.f36340a).d(), yk.c.e(d0.a(xk.c.class, l0.class)).b(q.k(d0.a(xk.c.class, Executor.class))).e(b.f36341a).d(), yk.c.e(d0.a(xk.b.class, l0.class)).b(q.k(d0.a(xk.b.class, Executor.class))).e(c.f36342a).d(), yk.c.e(d0.a(xk.d.class, l0.class)).b(q.k(d0.a(xk.d.class, Executor.class))).e(d.f36343a).d());
    }
}

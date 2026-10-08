package kq;

import androidx.p016lifecycle.t0;
import er.l;
import fr.w;
import hq.c;
import p071kotlin.Metadata;
import p7.CreationExtras;
import p7.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"VMF", "Lp7/a;", "Lkotlin/Function1;", "Landroidx/lifecycle/t0;", "callback", "b", "(Lp7/a;Ler/l;)Lp7/a;", "Lp7/d;", "a", "(Lp7/d;Ler/l;)Lp7/a;", "hilt-android_main_java_dagger_hilt_android_lifecycle-hilt_view_model_extensions"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: kq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "factory", "Landroidx/lifecycle/t0;", "c", "(Ljava/lang/Object;)Landroidx/lifecycle/t0;"}, k = 3, mv = {2, 1, 0})
    static final class C2715a extends w implements l<Object, t0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<VMF, t0> f112252b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2715a(l<? super VMF, ? extends t0> lVar) {
            super(1);
            this.f112252b = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final t0 b(Object obj) {
            return this.f112252b.b((VMF) obj);
        }
    }

    public static final <VMF> CreationExtras a(d dVar, l<? super VMF, ? extends t0> lVar) {
        dVar.c(c.f86279e, new C2715a(lVar));
        return dVar;
    }

    public static final <VMF> CreationExtras b(CreationExtras creationExtras, l<? super VMF, ? extends t0> lVar) {
        return a(new d(creationExtras), lVar);
    }
}

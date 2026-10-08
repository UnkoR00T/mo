package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ltq/i$b;", "R", "Lkotlin/Function1;", "Ltq/e;", "", "block", "V", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "u", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q1 extends tq.i.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f10733a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.q1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/q1$a;", "Ltq/i$c;", "Landroidx/compose/ui/platform/q1;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements tq.i.c<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f10733a = new Companion();

        private Companion() {
        }
    }

    <R> Object V(er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super R> eVar);

    @Override // tq.i.b
    default tq.i.c<?> getKey() {
        return INSTANCE;
    }
}

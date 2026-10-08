package z3;

import er.l;
import fr.p0;
import fr.w;
import g4.q1;
import g4.r1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lz3/a;", "connection", "Lz3/b;", "dispatcher", "Lg4/g;", "c", "(Lz3/a;Lz3/b;)Lg4/g;", "Lg4/q1;", "T", "b", "(Lg4/q1;)Lg4/q1;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg4/q1;", "T", "it", "", "c", "(Lg4/q1;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class a<T> extends w implements l<T, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0<T> f232752b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0<T> p0Var) {
            super(1);
            this.f232752b = p0Var;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(q1 q1Var) {
            boolean z15;
            if (q1Var.getNode().getIsAttached()) {
                this.f232752b.f66410a = q1Var;
                z15 = false;
            } else {
                z15 = true;
            }
            return Boolean.valueOf(z15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends q1> T b(T t15) {
        p0 p0Var = new p0();
        r1.d(t15, new a(p0Var));
        return (T) p0Var.f66410a;
    }

    public static final g4.g c(z3.a aVar, b bVar) {
        return new e(aVar, bVar);
    }
}

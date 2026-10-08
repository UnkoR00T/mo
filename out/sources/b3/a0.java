package b3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a[\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\b\"\u0004\b\u0000\u0010\u000b¢\u0006\u0004\b\f\u0010\r\"\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Lb3/b0;", "save", "Lkotlin/Function1;", "restore", "Lb3/x;", "e", "(Ler/p;Ler/l;)Lb3/x;", "T", "f", "()Lb3/x;", "a", "Lb3/x;", "AutoSaver", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x<Object, Object> f16295a = e(new er.p() { // from class: b3.y
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return a0.c((b0) obj, obj2);
        }
    }, new er.l() { // from class: b3.z
        @Override // er.l
        public final Object b(Object obj) {
            return a0.d(obj);
        }
    });

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"b3/a0$a", "Lb3/x;", "Lb3/b0;", "value", "a", "(Lb3/b0;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<Original, Saveable> implements x<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.p<b0, Original, Saveable> f16296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Saveable, Original> f16297b;

        /* JADX WARN: Multi-variable type inference failed */
        a(er.p<? super b0, ? super Original, ? extends Saveable> pVar, er.l<? super Saveable, ? extends Original> lVar) {
            this.f16296a = pVar;
            this.f16297b = lVar;
        }

        @Override // b3.x
        public Saveable a(b0 b0Var, Original original) {
            return this.f16296a.B(b0Var, original);
        }

        @Override // b3.x
        public Original b(Saveable value) {
            return this.f16297b.b(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(b0 b0Var, Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    public static final <Original, Saveable> x<Original, Saveable> e(er.p<? super b0, ? super Original, ? extends Saveable> pVar, er.l<? super Saveable, ? extends Original> lVar) {
        return new a(pVar, lVar);
    }

    public static final <T> x<T, Object> f() {
        return (x<T, Object>) f16295a;
    }
}

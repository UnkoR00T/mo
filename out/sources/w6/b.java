package w6;

import android.content.Context;
import android.content.SharedPreferences;
import er.p;
import er.q;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import tq.e;
import u6.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001cB\u0089\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001f\u0010 R0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,¨\u0006."}, d2 = {"Lw6/b;", "T", "Lu6/g;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Ltq/e;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "Lw6/d;", "migrate", "Landroid/content/Context;", "context", "name", "<init>", "(Ler/a;Ljava/util/Set;Ler/p;Ler/q;Landroid/content/Context;Ljava/lang/String;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Ler/p;Ler/q;)V", "Loq/i0;", "f", "(Landroid/content/Context;Ljava/lang/String;)V", "currentData", "b", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "a", "c", "(Ltq/e;)Ljava/lang/Object;", "Ler/p;", "Ler/q;", "Landroid/content/Context;", "d", "Ljava/lang/String;", "e", "Loq/k;", "g", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "Ljava/util/Set;", "keySet", "datastore"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p<T, e<? super Boolean>, Object> shouldRunMigration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q<d, T, e<? super T>, Object> migrate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k sharedPrefs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<String> keySet;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a extends vq.k implements p<T, e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210541e;

        a(e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f210541e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(true);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(T t15, e<? super Boolean> eVar) {
            return ((a) v(t15, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(eVar);
        }
    }

    /* JADX INFO: renamed from: w6.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw6/b$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C5531b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5531b f210542a = new C5531b();

        private C5531b() {
        }

        public static final boolean a(Context context, String name) {
            return context.deleteSharedPreferences(name);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f210543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b<T> f210544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f210545f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<T> bVar, e<? super c> eVar) {
            super(eVar);
            this.f210544e = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f210543d = obj;
            this.f210545f |= PKIFailureInfo.systemUnavail;
            return this.f210544e.b(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(er.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super e<? super Boolean>, ? extends Object> pVar, q<? super d, ? super T, ? super e<? super T>, ? extends Object> qVar, Context context, String str) {
        this.shouldRunMigration = pVar;
        this.migrate = qVar;
        this.context = context;
        this.name = str;
        this.sharedPrefs = l.a(aVar);
        this.keySet = set == w6.c.a() ? null : v.j1(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences e(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    private final void f(Context context, String name) {
        C5531b.a(context, name);
    }

    private final SharedPreferences g() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    @Override // u6.g
    public Object a(T t15, e<? super T> eVar) {
        return this.migrate.w(new d(g(), this.keySet), t15, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u6.g
    public Object b(T t15, e<? super Boolean> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f210545f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f210545f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(this, eVar);
            }
        } else {
            cVar = new c(this, eVar);
        }
        Object objB = cVar.f210543d;
        Object objE = uq.b.e();
        int i16 = cVar.f210545f;
        boolean z15 = true;
        if (i16 == 0) {
            u.b(objB);
            p<T, e<? super Boolean>, Object> pVar = this.shouldRunMigration;
            cVar.f210545f = 1;
            objB = pVar.B(t15, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        if (!((Boolean) objB).booleanValue()) {
            return vq.b.a(false);
        }
        Set<String> set = this.keySet;
        if (set != null) {
            Set<String> set2 = set;
            SharedPreferences sharedPreferencesG = g();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z15 = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesG.contains((String) it.next())) {
                    }
                }
                z15 = false;
            }
        } else if (g().getAll().isEmpty()) {
            z15 = false;
        }
        return vq.b.a(z15);
    }

    @Override // u6.g
    public Object c(e<? super i0> eVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = g().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (g().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            f(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return i0.f148189a;
    }

    public /* synthetic */ b(Context context, String str, Set set, p pVar, q qVar, int i15, fr.k kVar) {
        this(context, str, (i15 & 4) != 0 ? w6.c.a() : set, (i15 & 8) != 0 ? new a(null) : pVar, qVar);
    }

    public b(final Context context, final String str, Set<String> set, p<? super T, ? super e<? super Boolean>, ? extends Object> pVar, q<? super d, ? super T, ? super e<? super T>, ? extends Object> qVar) {
        this(new er.a() { // from class: w6.a
            @Override // er.a
            public final Object a() {
                return b.e(context, str);
            }
        }, set, pVar, qVar, context, str);
    }
}

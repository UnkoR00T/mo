package f6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.k0;
import r0.c0;
import r0.l1;
import x5.p;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c0<String, Typeface> f59378a = new c0<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f59379b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f59380c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final l1<String, ArrayList<i6.a<e>>> f59381d = new l1<>();

    class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f59383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f6.e f59384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59385d;

        a(String str, Context context, f6.e eVar, int i15) {
            this.f59382a = str;
            this.f59383b = context;
            this.f59384c = eVar;
            this.f59385d = i15;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f59382a, this.f59383b, k0.a(new Object[]{this.f59384c}), this.f59385d);
        }
    }

    class b implements i6.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f6.a f59386a;

        b(f6.a aVar) {
            this.f59386a = aVar;
        }

        @Override // i6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f59386a.b(eVar);
        }
    }

    class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f59388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f59389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59390d;

        c(String str, Context context, List list, int i15) {
            this.f59387a = str;
            this.f59388b = context;
            this.f59389c = list;
            this.f59390d = i15;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f59387a, this.f59388b, this.f59389c, this.f59390d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements i6.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59391a;

        d(String str) {
            this.f59391a = str;
        }

        @Override // i6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f59380c) {
                try {
                    l1<String, ArrayList<i6.a<e>>> l1Var = f.f59381d;
                    ArrayList<i6.a<e>> arrayList = l1Var.get(this.f59391a);
                    if (arrayList == null) {
                        return;
                    }
                    l1Var.remove(this.f59391a);
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        arrayList.get(i15).accept(eVar);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private static String a(List<f6.e> list, int i15) {
        StringBuilder sb5 = new StringBuilder();
        for (int i16 = 0; i16 < list.size(); i16++) {
            sb5.append(list.get(i16).d());
            sb5.append("-");
            sb5.append(i15);
            if (i16 < list.size() - 1) {
                sb5.append(";");
            }
        }
        return sb5.toString();
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i15 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        g.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i15 = 0;
            for (g.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i15;
    }

    static e c(String str, Context context, List<f6.e> list, int i15) {
        eb.a.c("getFontSync");
        try {
            c0<String, Typeface> c0Var = f59378a;
            Typeface typefaceD = c0Var.d(str);
            if (typefaceD != null) {
                e eVar = new e(typefaceD);
                eb.a.f();
                return eVar;
            }
            try {
                g.a aVarE = f6.d.e(context, list, null);
                int iB = b(aVarE);
                if (iB != 0) {
                    e eVar2 = new e(iB);
                    eb.a.f();
                    return eVar2;
                }
                Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? p.b(context, null, aVarE.c(), i15) : p.c(context, null, aVarE.d(), i15);
                if (typefaceB == null) {
                    e eVar3 = new e(-3);
                    eb.a.f();
                    return eVar3;
                }
                c0Var.e(str, typefaceB);
                e eVar4 = new e(typefaceB);
                eb.a.f();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                eb.a.f();
                return eVar5;
            }
        } catch (Throwable th4) {
            eb.a.f();
            throw th4;
        }
    }

    static Typeface d(Context context, List<f6.e> list, int i15, Executor executor, f6.a aVar) {
        String strA = a(list, i15);
        Typeface typefaceD = f59378a.d(strA);
        if (typefaceD != null) {
            aVar.b(new e(typefaceD));
            return typefaceD;
        }
        b bVar = new b(aVar);
        synchronized (f59380c) {
            try {
                l1<String, ArrayList<i6.a<e>>> l1Var = f59381d;
                ArrayList<i6.a<e>> arrayList = l1Var.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<i6.a<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                l1Var.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i15);
                if (executor == null) {
                    executor = f59379b;
                }
                h.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    static Typeface e(Context context, f6.e eVar, f6.a aVar, int i15, int i16) {
        String strA = a(k0.a(new Object[]{eVar}), i15);
        Typeface typefaceD = f59378a.d(strA);
        if (typefaceD != null) {
            aVar.b(new e(typefaceD));
            return typefaceD;
        }
        if (i16 == -1) {
            e eVarC = c(strA, context, k0.a(new Object[]{eVar}), i15);
            aVar.b(eVarC);
            return eVarC.f59392a;
        }
        try {
            e eVar2 = (e) h.d(f59379b, new a(strA, context, eVar, i15), i16);
            aVar.b(eVar2);
            return eVar2.f59392a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f59392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f59393b;

        e(int i15) {
            this.f59392a = null;
            this.f59393b = i15;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f59393b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f59392a = typeface;
            this.f59393b = 0;
        }
    }
}

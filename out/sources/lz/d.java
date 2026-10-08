package lz;

import android.content.Context;
import er.p;
import iy.g0;
import java.util.Locale;
import java.util.Map;
import ju.j;
import ju.p0;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Llz/d;", "Ljx/a;", "Landroid/content/Context;", "context", "Liy/g0;", "uuidGenerator", "<init>", "(Landroid/content/Context;Liy/g0;)V", "", "c", "()Ljava/lang/String;", "Ljx/e;", "e", "()Ljx/e;", "", "d", "()Ljava/util/Map;", "a", "b", "Landroid/content/Context;", "Liy/g0;", "Loq/k;", "h", "sessionUUID", "info_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class d implements jx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 uuidGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k sessionUUID = l.a(new er.a() { // from class: lz.c
        @Override // er.a
        public final Object a() {
            return d.i(this.f121601a);
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super String>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121605e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121605e;
            if (i15 == 0) {
                u.b(obj);
                g0 g0Var = d.this.uuidGenerator;
                this.f121605e = 1;
                obj = g0Var.a(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            String str = (String) obj;
            px.f.h(px.f.f163100a, "Created X-Session-Id: " + str, null, 2, null);
            return str;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super String> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return d.this.new a(eVar);
        }
    }

    public d(Context context, g0 g0Var) {
        this.context = context;
        this.uuidGenerator = g0Var;
    }

    private final String h() {
        return (String) this.sessionUUID.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(d dVar) {
        return (String) j.b(null, dVar.new a(null), 1, null);
    }

    @Override // jx.a
    public String a() {
        int iO = androidx.appcompat.app.f.o();
        if (iO == -100 || iO == -1) {
            return (this.context.getResources().getConfiguration().uiMode & 48) == 32 ? "DARK" : "LIGHT";
        }
        return (iO == 1 || iO != 2) ? "LIGHT" : "DARK";
    }

    @Override // jx.a
    public String b() {
        return h();
    }

    @Override // jx.a
    public String c() {
        String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        return str == null ? "" : str;
    }

    @Override // jx.a
    public Map<String, String> d() {
        return v0.i();
    }

    @Override // jx.a
    public jx.e e() {
        String language = Locale.getDefault().getLanguage();
        if (language == null) {
            language = "pl";
        }
        int iHashCode = language.hashCode();
        if (iHashCode != 3241) {
            if (iHashCode != 3580) {
                if (iHashCode == 3734 && language.equals("uk")) {
                    return jx.e.UKRAINIAN;
                }
            } else if (language.equals("pl")) {
                return jx.e.POLISH;
            }
        } else if (language.equals("en")) {
            return jx.e.ENGLISH;
        }
        return jx.e.UNKNOWN;
    }
}

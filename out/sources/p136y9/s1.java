package p136y9;

import android.os.Bundle;
import er.l;
import eu.k;
import fr.t;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import oq.i0;
import p071kotlin.Metadata;
import p136y9.y0;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u00020-B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010 \u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00028\u00002\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\u000b2\n\u0010$\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u00106\u001a\u00020#2\u0006\u00103\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010(R\u0014\u0010\n\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Ly9/s1;", "Ly9/y0;", ip.a.f96138c, "", "<init>", "()V", "", "name", "(Ljava/lang/String;)V", "Ly9/u1;", "state", "Loq/i0;", "i", "(Ly9/u1;)V", "c", "()Ly9/y0;", "", "Ly9/w;", "entries", "Ly9/i1;", "navOptions", "Ly9/s1$a;", "navigatorExtras", "g", "(Ljava/util/List;Ly9/i1;Ly9/s1$a;)V", "backStackEntry", "j", "(Ly9/w;)V", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "args", "f", "(Ly9/y0;Landroid/os/Bundle;Ly9/i1;Ly9/s1$a;)Ly9/y0;", "popUpTo", "", "savedState", "n", "(Ly9/w;Z)V", "o", "()Z", "m", "()Landroid/os/Bundle;", "l", "(Landroid/os/Bundle;)V", "a", "Ljava/lang/String;", "_name", "b", "Ly9/u1;", "_state", "value", "Z", "e", "isAttached", "d", "()Ly9/u1;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class s1<D extends y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String _name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private u1 _state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Ly9/s1$a;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly9/s1$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public s1() {
        this._name = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final w h(s1 s1Var, i1 i1Var, a aVar, w wVar) {
        y0 y0VarF;
        y0 y0VarE = wVar.getDestination();
        if (y0VarE == null) {
            y0VarE = null;
        }
        if (y0VarE == null || (y0VarF = s1Var.f(y0VarE, wVar.c(), i1Var, aVar)) == null) {
            return null;
        }
        return t.c(y0VarF, y0VarE) ? wVar : s1Var.d().b(y0VarF, y0VarF.g(wVar.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(j1 j1Var) {
        j1Var.d(true);
        return i0.f148189a;
    }

    public abstract D c();

    protected final u1 d() {
        u1 u1Var = this._state;
        if (u1Var != null) {
            return u1Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public y0 f(D destination, Bundle args, i1 navOptions, a navigatorExtras) {
        return destination;
    }

    public void g(List<w> entries, final i1 navOptions, final a navigatorExtras) {
        Iterator it = k.z(k.H(v.a0(entries), new l() { // from class: y9.q1
            @Override // er.l
            public final Object b(Object obj) {
                return s1.h(this.f225474a, navOptions, navigatorExtras, (w) obj);
            }
        })).iterator();
        while (it.hasNext()) {
            d().k((w) it.next());
        }
    }

    public void i(u1 state) {
        this._state = state;
        this.isAttached = true;
    }

    public void j(w backStackEntry) {
        y0 y0VarE = backStackEntry.getDestination();
        if (y0VarE == null) {
            y0VarE = null;
        }
        if (y0VarE == null) {
            return;
        }
        f(y0VarE, null, Function1.a(new l() { // from class: y9.r1
            @Override // er.l
            public final Object b(Object obj) {
                return s1.k((j1) obj);
            }
        }), null);
        d().g(backStackEntry);
    }

    public void l(Bundle savedState) {
    }

    public Bundle m() {
        return null;
    }

    public void n(w popUpTo, boolean savedState) {
        List<w> value = d().c().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<w> listIterator = value.listIterator(value.size());
        w wVarPrevious = null;
        while (o()) {
            wVarPrevious = listIterator.previous();
            if (t.c(wVarPrevious, popUpTo)) {
                break;
            }
        }
        if (wVarPrevious != null) {
            d().h(wVarPrevious, savedState);
        }
    }

    public boolean o() {
        return true;
    }

    public s1(String str) {
        this._name = str;
    }
}

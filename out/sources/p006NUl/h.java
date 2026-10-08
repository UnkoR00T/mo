package p006NUl;

import android.content.Intent;
import android.os.Bundle;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.n;
import androidx.p016lifecycle.q;
import fr.k;
import fr.w0;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p087nuL.b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\b&\u0018\u0000 \u000e2\u00020\u0001:\u00037=:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b)\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00104\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00108R\u0014\u0010F\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010E¨\u0006G"}, d2 = {"LNUl/h;", "", "<init>", "()V", "O", "", "key", "", "resultCode", "Landroid/content/Intent;", "data", "LNUl/h$a;", "callbackAndContract", "Loq/i0;", "h", "(Ljava/lang/String;ILandroid/content/Intent;LNUl/h$a;)V", "q", "(Ljava/lang/String;)V", "i", "()I", "rc", "e", "(ILjava/lang/String;)V", "I", "requestCode", "LnuL/b0;", "contract", "input", "Ls5/c;", "options", "k", "(ILnuL/b0;Ljava/lang/Object;Ls5/c;)V", "Landroidx/lifecycle/q;", "lifecycleOwner", "LNUl/d;", "callback", "LNUl/e;", "n", "(Ljava/lang/String;Landroidx/lifecycle/q;LnuL/b0;LNUl/d;)LNUl/e;", "o", "(Ljava/lang/String;LnuL/b0;LNUl/d;)LNUl/e;", "r", "Landroid/os/Bundle;", "outState", "m", "(Landroid/os/Bundle;)V", "savedInstanceState", "l", "", "f", "(IILandroid/content/Intent;)Z", "result", "g", "(ILjava/lang/Object;)Z", "", "a", "Ljava/util/Map;", "rcToKey", "b", "keyToRc", "LNUl/h$c;", "c", "keyToLifecycleContainers", "", "d", "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f269h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, c> keyToLifecycleContainers = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> launchedKeys = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final transient Map<String, a<?>> keyToCallback = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bundle pendingResults = new Bundle();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LNUl/h$a;", "O", "", "LNUl/d;", "callback", "LnuL/b0;", "contract", "<init>", "(LNUl/d;LnuL/b0;)V", "a", "LNUl/d;", "()LNUl/d;", "b", "LnuL/b0;", "()LnuL/b0;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p006NUl.d<O> callback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b0<?, O> contract;

        public a(p006NUl.d<O> dVar, b0<?, O> b0Var) {
            this.callback = dVar;
            this.contract = b0Var;
        }

        public final p006NUl.d<O> a() {
            return this.callback;
        }

        public final b0<?, O> b() {
            return this.contract;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LNUl/h$b;", "", "<init>", "()V", "", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "LOG_TAG", "", "INITIAL_REQUEST_CODE_VALUE", "I", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"LNUl/h$c;", "", "Landroidx/lifecycle/j;", "lifecycle", "<init>", "(Landroidx/lifecycle/j;)V", "Landroidx/lifecycle/n;", "observer", "Loq/i0;", "a", "(Landroidx/lifecycle/n;)V", "b", "()V", "Landroidx/lifecycle/j;", "getLifecycle", "()Landroidx/lifecycle/j;", "", "Ljava/util/List;", "observers", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j lifecycle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<n> observers = new ArrayList();

        public c(j jVar) {
            this.lifecycle = jVar;
        }

        public final void a(n observer) {
            this.lifecycle.a(observer);
            this.observers.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.d((n) it.next());
            }
            this.observers.clear();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"NUl/h$d", "LNUl/e;", "input", "Ls5/c;", "options", "Loq/i0;", "b", "(Ljava/lang/Object;Ls5/c;)V", "c", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d<I> extends p006NUl.e<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0<I, O> f283c;

        d(String str, b0<I, O> b0Var) {
            this.f282b = str;
            this.f283c = b0Var;
        }

        @Override // p006NUl.e
        public void b(I input, s5.c options) throws Exception {
            Object obj = h.this.keyToRc.get(this.f282b);
            Object obj2 = this.f283c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                h.this.launchedKeys.add(this.f282b);
                try {
                    h.this.k(iIntValue, this.f283c, input, options);
                    return;
                } catch (Exception e15) {
                    h.this.launchedKeys.remove(this.f282b);
                    throw e15;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p006NUl.e
        public void c() {
            h.this.r(this.f282b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"NUl/h$e", "LNUl/e;", "input", "Ls5/c;", "options", "Loq/i0;", "b", "(Ljava/lang/Object;Ls5/c;)V", "c", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e<I> extends p006NUl.e<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0<I, O> f286c;

        e(String str, b0<I, O> b0Var) {
            this.f285b = str;
            this.f286c = b0Var;
        }

        @Override // p006NUl.e
        public void b(I input, s5.c options) throws Exception {
            Object obj = h.this.keyToRc.get(this.f285b);
            Object obj2 = this.f286c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                h.this.launchedKeys.add(this.f285b);
                try {
                    h.this.k(iIntValue, this.f286c, input, options);
                    return;
                } catch (Exception e15) {
                    h.this.launchedKeys.remove(this.f285b);
                    throw e15;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p006NUl.e
        public void c() {
            h.this.r(this.f285b);
        }
    }

    private final void e(int rc5, String key) {
        this.rcToKey.put(Integer.valueOf(rc5), key);
        this.keyToRc.put(key, Integer.valueOf(rc5));
    }

    private final <O> void h(String key, int resultCode, Intent data, a<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new p006NUl.c(resultCode, data));
        } else {
            callbackAndContract.a().a(callbackAndContract.b().c(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    private final int i() {
        for (Number number : eu.k.n(new er.a() { // from class: NUl.f
            @Override // er.a
            public final Object a() {
                return h.j();
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer j() {
        return Integer.valueOf(jr.c.INSTANCE.f(2147418112) + PKIFailureInfo.notAuthorized);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h hVar, String str, p006NUl.d dVar, b0 b0Var, q qVar, j.a aVar) {
        if (j.a.ON_START != aVar) {
            if (j.a.ON_STOP == aVar) {
                hVar.keyToCallback.remove(str);
                return;
            } else {
                if (j.a.ON_DESTROY == aVar) {
                    hVar.r(str);
                    return;
                }
                return;
            }
        }
        hVar.keyToCallback.put(str, new a<>(dVar, b0Var));
        if (hVar.parsedPendingResults.containsKey(str)) {
            Object obj = hVar.parsedPendingResults.get(str);
            hVar.parsedPendingResults.remove(str);
            dVar.a(obj);
        }
        p006NUl.c cVar = (p006NUl.c) e6.b.a(hVar.pendingResults, str, p006NUl.c.class);
        if (cVar != null) {
            hVar.pendingResults.remove(str);
            dVar.a(b0Var.c(cVar.getResultCode(), cVar.getData()));
        }
    }

    private final void q(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        e(i(), key);
    }

    public final boolean f(int requestCode, int resultCode, Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        h(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    public final <O> boolean g(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.keyToCallback.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        p006NUl.d<?> dVarA = aVar.a();
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        dVarA.a(result);
        return true;
    }

    public abstract <I, O> void k(int requestCode, b0<I, O> contract, I input, s5.c options);

    public final void l(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            String str = stringArrayList.get(i15);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    w0.d(this.rcToKey).remove(numRemove);
                }
            }
            e(integerArrayList.get(i15).intValue(), stringArrayList.get(i15));
        }
    }

    public final void m(Bundle outState) {
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.launchedKeys));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.pendingResults));
    }

    public final <I, O> p006NUl.e<I> n(final String key, q lifecycleOwner, final b0<I, O> contract, final p006NUl.d<O> callback) {
        j lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState().e(j.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        q(key);
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new n() { // from class: NUl.g
            @Override // androidx.p016lifecycle.n
            public final void m(q qVar, j.a aVar) {
                h.p(this.f265a, key, callback, contract, qVar, aVar);
            }
        });
        this.keyToLifecycleContainers.put(key, cVar);
        return new d(key, contract);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> p006NUl.e<I> o(String key, b0<I, O> contract, p006NUl.d<O> callback) {
        q(key);
        this.keyToCallback.put(key, new a<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.a(obj);
        }
        p006NUl.c cVar = (p006NUl.c) e6.b.a(this.pendingResults, key, p006NUl.c.class);
        if (cVar != null) {
            this.pendingResults.remove(key);
            callback.a(contract.c(cVar.getResultCode(), cVar.getData()));
        }
        return new e(key, contract);
    }

    public final void r(String key) {
        Integer numRemove;
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            c2.g("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            c2.g("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((p006NUl.c) e6.b.a(this.pendingResults, key, p006NUl.c.class)));
            this.pendingResults.remove(key);
        }
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar != null) {
            cVar.b();
            this.keyToLifecycleContainers.remove(key);
        }
    }
}

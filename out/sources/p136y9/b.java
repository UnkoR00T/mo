package p136y9;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import eu.k;
import fr.t;
import io.sentry.android.core.c2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lr.m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@s1.b("activity")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038G¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Ly9/b;", "Ly9/s1;", "Ly9/b$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "q", "()Ly9/b$b;", "", "o", "()Z", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "args", "Ly9/i1;", "navOptions", "Ly9/s1$a;", "navigatorExtras", "Ly9/y0;", "s", "(Ly9/b$b;Landroid/os/Bundle;Ly9/i1;Ly9/s1$a;)Ly9/y0;", "d", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "e", "Landroid/app/Activity;", "hostActivity", "f", "b", "c", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b extends s1<C6039b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Activity hostActivity;

    /* JADX INFO: renamed from: y9.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001e8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t8F@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b¨\u0006%"}, d2 = {"Ly9/b$b;", "Ly9/y0;", "Ly9/s1;", "activityNavigator", "<init>", "(Ly9/s1;)V", "", "G", "()Z", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Intent;", "value", "h", "Landroid/content/Intent;", "Q", "()Landroid/content/Intent;", "intent", "j", "Ljava/lang/String;", i.f37086m, "dataPattern", "Landroid/content/ComponentName;", "component", "Landroid/content/ComponentName;", "M", "()Landroid/content/ComponentName;", "action", i.f37094u, "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class C6039b extends y0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Intent intent;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private String dataPattern;

        public C6039b(s1<? extends C6039b> s1Var) {
            super(s1Var);
        }

        @Override // p136y9.y0
        public boolean G() {
            return false;
        }

        public final String L() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName M() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final String getDataPattern() {
            return this.dataPattern;
        }

        /* JADX INFO: renamed from: Q, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        @Override // p136y9.y0
        public boolean equals(Object other) {
            boolean zFilterEquals;
            if (this == other) {
                return true;
            }
            if (other != null && (other instanceof C6039b) && super.equals(other)) {
                Intent intent = this.intent;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((C6039b) other).intent);
                } else {
                    zFilterEquals = ((C6039b) other).intent == null;
                }
                if (zFilterEquals && t.c(this.dataPattern, ((C6039b) other).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p136y9.y0
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.dataPattern;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // p136y9.y0
        public String toString() {
            ComponentName componentNameM = M();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(super.toString());
            if (componentNameM != null) {
                sb5.append(" class=");
                sb5.append(componentNameM.getClassName());
            } else {
                String strL = L();
                if (strL != null) {
                    sb5.append(" action=");
                    sb5.append(strL);
                }
            }
            return sb5.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly9/b$c;", "Ly9/s1$a;", "", "flags", "I", "b", "()I", "Ls5/c;", "activityOptions", "Ls5/c;", "a", "()Ls5/c;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements s1.a {
        public final s5.c a() {
            throw null;
        }

        public final int b() {
            throw null;
        }
    }

    public b(Context context) {
        this.context = context;
        for (Object obj : k.o(context, new l() { // from class: y9.a
            @Override // er.l
            public final Object b(Object obj2) {
                return b.r((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.hostActivity = (Activity) obj;
            }
        }
        obj = null;
        this.hostActivity = (Activity) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context r(Context context) {
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @Override // p136y9.s1
    public boolean o() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // p136y9.s1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C6039b c() {
        return new C6039b(this);
    }

    @Override // p136y9.s1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public y0 f(C6039b destination, Bundle args, i1 navOptions, s1.a navigatorExtras) {
        Intent intent;
        int intExtra;
        String strEncode;
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.o() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (args != null) {
            intent2.putExtras(args);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    Bundle bundleA = ua.c.a(args);
                    String strGroup = matcher.group(1);
                    if (!ua.c.b(bundleA, strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + args + " to fill data pattern " + dataPattern).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    t tVar = destination.k().get(strGroup);
                    l1<Object> l1VarA = tVar != null ? tVar.a() : null;
                    if (l1VarA == null || (strEncode = l1VarA.h(l1VarA.a(args, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(args.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z15 = navigatorExtras instanceof c;
        if (z15) {
            intent2.addFlags(((c) navigatorExtras).b());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.getSingleTop()) {
            intent2.addFlags(PKIFailureInfo.duplicateCertReq);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.o());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim <= 0 || !t.c(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !t.c(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", popEnterAnim);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", popExitAnim);
            } else {
                c2.g("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            }
        }
        if (z15) {
            ((c) navigatorExtras).a();
            this.context.startActivity(intent2);
        } else {
            this.context.startActivity(intent2);
        }
        if (navOptions != null && this.hostActivity != null) {
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim > 0 && t.c(resources.getResourceTypeName(enterAnim), "animator")) || (exitAnim > 0 && t.c(resources.getResourceTypeName(exitAnim), "animator"))) {
                c2.g("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
            } else if (enterAnim >= 0 || exitAnim >= 0) {
                this.hostActivity.overridePendingTransition(m.e(enterAnim, 0), m.e(exitAnim, 0));
            }
        }
        return null;
    }
}

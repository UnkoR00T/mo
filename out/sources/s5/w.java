package s5;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterable<Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Intent> f177980a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f177981b;

    public interface a {
        Intent g();
    }

    private w(Context context) {
        this.f177981b = context;
    }

    public static w i(Context context) {
        return new w(context);
    }

    public w e(Intent intent) {
        this.f177980a.add(intent);
        return this;
    }

    public w f(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f177981b.getPackageManager());
        }
        if (component != null) {
            h(component);
        }
        e(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w g(Activity activity) {
        Intent intentG = activity instanceof a ? ((a) activity).g() : null;
        if (intentG == null) {
            intentG = j.a(activity);
        }
        if (intentG != null) {
            ComponentName component = intentG.getComponent();
            if (component == null) {
                component = intentG.resolveActivity(this.f177981b.getPackageManager());
            }
            h(component);
            e(intentG);
        }
        return this;
    }

    public w h(ComponentName componentName) {
        int size = this.f177980a.size();
        try {
            Intent intentB = j.b(this.f177981b, componentName);
            while (intentB != null) {
                this.f177980a.add(size, intentB);
                intentB = j.b(this.f177981b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e15) {
            c2.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e15);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f177980a.iterator();
    }

    public void j() {
        k(null);
    }

    public void k(Bundle bundle) {
        if (this.f177980a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f177980a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (u5.a.o(this.f177981b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f177981b.startActivity(intent);
    }
}

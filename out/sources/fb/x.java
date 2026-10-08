package fb;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public View f60692b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f60691a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<k> f60693c = new ArrayList<>();

    @Deprecated
    public x() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f60692b == xVar.f60692b && this.f60691a.equals(xVar.f60691a);
    }

    public int hashCode() {
        return (this.f60692b.hashCode() * 31) + this.f60691a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f60692b + "\n") + "    values:";
        for (String str2 : this.f60691a.keySet()) {
            str = str + "    " + str2 + ": " + this.f60691a.get(str2) + "\n";
        }
        return str;
    }

    public x(View view) {
        this.f60692b = view;
    }
}

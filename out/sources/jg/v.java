package jg;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f102562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f102563b;

    public v(Context context) {
        s.l(context);
        Resources resources = context.getResources();
        this.f102562a = resources;
        this.f102563b = resources.getResourcePackageName(gg.l.f72743a);
    }

    public String a(String str) {
        String str2 = this.f102563b;
        Resources resources = this.f102562a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}

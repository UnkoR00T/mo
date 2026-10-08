package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class qv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.s f33451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f33452c;

    public qv0(Context context, com.google.common.util.concurrent.s sVar) {
        this.f33450a = context;
        this.f33451b = sVar;
        this.f33452c = sVar.submit(new Callable() { // from class: com.google.android.libraries.places.internal.pv0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f33353a.f33450a.getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("zb", "");
        return string == null ? "" : string;
    }

    public final com.google.common.util.concurrent.q a() {
        final lv0 lv0Var = lv0.f32884a;
        return com.google.common.util.concurrent.k.d(this.f33452c, new zj.g() { // from class: com.google.android.libraries.places.internal.mv0
            @Override // zj.g
            public final /* synthetic */ Object apply(Object obj) {
                er.l lVar = lv0Var;
                return qv0.f((SharedPreferences) obj);
            }
        }, this.f33451b);
    }

    public final void b(final String str) {
        final er.l lVar = new er.l() { // from class: com.google.android.libraries.places.internal.nv0
            @Override // er.l
            public final /* synthetic */ Object b(Object obj) {
                SharedPreferences.Editor editorPutString;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) obj).edit();
                if (editorEdit == null || (editorPutString = editorEdit.putString("zb", str)) == null) {
                    return null;
                }
                editorPutString.apply();
                return oq.i0.f148189a;
            }
        };
        com.google.common.util.concurrent.k.d(this.f33452c, new zj.g() { // from class: com.google.android.libraries.places.internal.ov0
            @Override // zj.g
            public final /* synthetic */ Object apply(Object obj) {
                return (oq.i0) lVar.b(obj);
            }
        }, this.f33451b);
    }
}

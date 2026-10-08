package com.google.android.gms.oss.licenses.v2;

import CON.x;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.ui.platform.t2;
import com.google.android.gms.internal.oss_licenses.e4;
import er.l;
import er.p;
import fr.k;
import java.io.IOException;
import java.io.InputStream;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.ColorScheme;
import p076m2.r;
import p076m2.t;
import p088nul.r0;
import ph.o;
import ph.u;
import y2.m;

/* JADX INFO: loaded from: classes3.dex */
public final class OssLicensesMenuActivity extends androidx.appcompat.app.c {
    public static final a H = new a(null);
    private static String I;

    public static final class a {
        public /* synthetic */ a(k kVar) {
        }

        public final void a(String str) {
            OssLicensesMenuActivity.I = str;
        }
    }

    public static final void P0(String str) {
        H.a(str);
    }

    private static final boolean R0(Context context, String str) {
        InputStream inputStreamOpenRawResource = null;
        try {
            Resources resources = context.getResources();
            inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(oh.a.f145726b)));
            boolean z15 = inputStreamOpenRawResource.available() > 0;
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
            return z15;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th4) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused4) {
                }
            }
            throw th4;
        }
    }

    @Override // androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        androidx.appcompat.app.a aVarE0;
        super.onCreate(bundle);
        x.c(this, null, null, 3, null);
        final String stringExtra = I;
        if (stringExtra == null) {
            stringExtra = getIntent().hasExtra("title") ? getIntent().getStringExtra("title") : null;
        }
        if (E0() != null && (aVarE0 = E0()) != null) {
            aVarE0.k();
        }
        final boolean z15 = false;
        if (R0(this, "third_party_licenses") && R0(this, "third_party_license_metadata")) {
            z15 = true;
        }
        r0.b(this, null, m.b(546016281, true, new p() { // from class: com.google.android.gms.oss.licenses.v2.d
            @Override // er.p
            public final /* synthetic */ Object B(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = iIntValue & 3;
                int i16 = iIntValue & 1;
                r rVar = (r) obj;
                OssLicensesMenuActivity.a aVar = OssLicensesMenuActivity.H;
                if (rVar.r(i15 != 2, i16)) {
                    if (t.k()) {
                        t.o(546016281, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.OssLicensesMenuActivity.onCreate.<anonymous> (OssLicensesMenuActivity.kt:46)");
                    }
                    final boolean z16 = z15;
                    final String str = stringExtra;
                    u.b(false, false, m.d(-1968053328, true, new p() { // from class: com.google.android.gms.oss.licenses.v2.a
                        @Override // er.p
                        public final /* synthetic */ Object B(Object obj3, Object obj4) {
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i17 = iIntValue2 & 3;
                            int i18 = iIntValue2 & 1;
                            r rVar2 = (r) obj3;
                            OssLicensesMenuActivity.a aVar2 = OssLicensesMenuActivity.H;
                            if (rVar2.r(i17 != 2, i18)) {
                                if (t.k()) {
                                    t.o(-1968053328, iIntValue2, -1, "com.google.android.gms.oss.licenses.v2.OssLicensesMenuActivity.onCreate.<anonymous>.<anonymous> (OssLicensesMenuActivity.kt:47)");
                                }
                                final long background = ((ColorScheme) rVar2.N(u.a())).getBackground();
                                f3.m mVarA = t2.a(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), "LicenseTheme");
                                boolean zD = rVar2.d(background);
                                Object objE = rVar2.E();
                                if (zD || objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: com.google.android.gms.oss.licenses.v2.b
                                        @Override // er.l
                                        public final /* synthetic */ Object b(Object obj5) {
                                            OssLicensesMenuActivity.a aVar3 = OssLicensesMenuActivity.H;
                                            e4.a((i0) obj5, background);
                                            return oq.i0.f148189a;
                                        }
                                    };
                                    rVar2.v(objE);
                                }
                                final boolean z17 = z16;
                                final String str2 = str;
                                androidx.compose.material3.l.g(v.d(mVarA, false, (l) objE, 1, null), null, background, 0L, 0.0f, 0.0f, null, m.d(-382829429, true, new p() { // from class: com.google.android.gms.oss.licenses.v2.c
                                    @Override // er.p
                                    public final /* synthetic */ Object B(Object obj5, Object obj6) {
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        int i19 = iIntValue3 & 3;
                                        int i25 = iIntValue3 & 1;
                                        r rVar3 = (r) obj5;
                                        OssLicensesMenuActivity.a aVar3 = OssLicensesMenuActivity.H;
                                        if (rVar3.r(i19 != 2, i25)) {
                                            if (t.k()) {
                                                t.o(-382829429, iIntValue3, -1, "com.google.android.gms.oss.licenses.v2.OssLicensesMenuActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OssLicensesMenuActivity.kt:55)");
                                            }
                                            o.a(null, str2, z17, rVar3, 0, 1);
                                            if (t.k()) {
                                                t.n();
                                            }
                                        } else {
                                            rVar3.O();
                                        }
                                        return oq.i0.f148189a;
                                    }
                                }, rVar2, 54), rVar2, 12582912, 122);
                                if (t.k()) {
                                    t.n();
                                }
                            } else {
                                rVar2.O();
                            }
                            return oq.i0.f148189a;
                        }
                    }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
                    if (t.k()) {
                        t.n();
                    }
                } else {
                    rVar.O();
                }
                return oq.i0.f148189a;
            }
        }), 1, null);
    }
}

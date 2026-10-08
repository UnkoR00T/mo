package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OssLicensesMenuActivity extends androidx.appcompat.app.c {
    private static String K;
    private boolean H;
    private c I;

    @Deprecated
    public static void P0(String str) {
        K = str;
    }

    static boolean Q0(Context context, String str) {
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
        super.onCreate(bundle);
        this.I = c.a(this);
        a.a(this);
        setContentView(oh.b.f145728b);
        boolean z15 = false;
        if (Q0(this, "third_party_licenses") && Q0(this, "third_party_license_metadata")) {
            z15 = true;
        }
        this.H = z15;
        if (K == null) {
            Intent intent = getIntent();
            if (intent.hasExtra("title")) {
                K = intent.getStringExtra("title");
                c2.g("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
            }
        }
        String str = K;
        if (str != null) {
            setTitle(str);
        }
        if (E0() != null) {
            E0().s(true);
        }
        String strD = this.I.d(getPackageName());
        b bVarB = c.b(this, strD);
        if (!this.H) {
            if (bundle == null) {
                c.a(this);
                int iF = c.f(bVarB);
                if (((oh.f) w0().i0(iF)) == null) {
                    w0().o().b(iF, new oh.f()).j();
                    return;
                }
                return;
            }
            return;
        }
        if (bundle == null) {
            c.a(this);
            int iF2 = c.f(bVarB);
            if (((m) w0().i0(iF2)) == null) {
                m mVar = new m();
                if (strD != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("license_activity_package_name", strD);
                    mVar.F1(bundle2);
                }
                w0().o().b(iF2, mVar).j();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}

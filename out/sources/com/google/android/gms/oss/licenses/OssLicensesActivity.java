package com.google.android.gms.oss.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.oss_licenses.j4;
import com.google.android.gms.internal.oss_licenses.k4;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OssLicensesActivity extends androidx.appcompat.app.c {
    private j4 H;
    private String I = "";
    private ScrollView K = null;
    private TextView L = null;
    private int O = 0;
    private c P;
    b R;

    final /* synthetic */ ScrollView P0() {
        return this.K;
    }

    final /* synthetic */ TextView Q0() {
        return this.L;
    }

    final /* synthetic */ int R0() {
        return this.O;
    }

    @Override // androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.a(this);
        setContentView(oh.b.f145727a);
        TextView textView = (TextView) findViewById(oh.a.f145725a);
        this.L = textView;
        textView.setText(getString(oh.d.f145733c));
        this.P = c.a(this);
        this.H = (j4) getIntent().getParcelableExtra("license");
        if (E0() != null) {
            E0().w(this.H.e());
            E0().t(true);
            E0().s(true);
            E0().u(null);
        }
        b bVarB = c.b(this, this.P.d(getPackageName()));
        this.R = bVarB;
        this.K = (ScrollView) findViewById(bVarB.f31432a.getIdentifier("license_activity_scrollview", "id", bVarB.f31433b));
        b bVar = this.R;
        this.L = (TextView) findViewById(bVar.f31432a.getIdentifier("license_activity_textview", "id", bVar.f31433b));
        String strE = this.P.e(this.H);
        this.I = strE;
        if (strE == null || strE.isEmpty()) {
            this.I = k4.b(this, this.H, oh.c.f145730a);
        }
        if (this.I == null) {
            this.I = getString(oh.d.f145732b);
        }
        this.L.setText(this.I);
        if (this.O == 0) {
            return;
        }
        this.K.post(new d(this));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.O = bundle.getInt("scroll_pos");
    }

    @Override // CON.p, s5.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.L;
        if (textView == null || this.K == null) {
            return;
        }
        bundle.putInt("scroll_pos", this.L.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.K.getScrollY())));
    }
}

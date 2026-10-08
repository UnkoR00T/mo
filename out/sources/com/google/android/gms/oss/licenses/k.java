package com.google.android.gms.oss.licenses;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.internal.oss_licenses.j4;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class k implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f31446a;

    k(m mVar) {
        Objects.requireNonNull(mVar);
        this.f31446a = mVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i15, long j15) {
        j4 j4Var = (j4) adapterView.getItemAtPosition(i15);
        m mVar = this.f31446a;
        Intent intent = new Intent(mVar.S1(), (Class<?>) OssLicensesActivity.class);
        intent.putExtra("license", j4Var);
        mVar.N1(intent);
    }
}

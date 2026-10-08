package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.internal.oss_licenses.j4;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
final class l extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f31447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, Context context) {
        super(context, c.g(mVar.R1()), c.h(mVar.R1()), new ArrayList());
        Objects.requireNonNull(mVar);
        this.f31447a = mVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i15, View view, ViewGroup viewGroup) {
        if (view == null) {
            m mVar = this.f31447a;
            LayoutInflater layoutInflaterI = mVar.I();
            b bVarR1 = mVar.R1();
            view = layoutInflaterI.inflate((XmlPullParser) bVarR1.f31432a.getXml(c.g(bVarR1)), viewGroup, false);
        }
        j4 j4Var = (j4) getItem(i15);
        if (j4Var != null) {
            ((TextView) view.findViewById(c.h(this.f31447a.R1()))).setText(j4Var.e());
        }
        return view;
    }
}

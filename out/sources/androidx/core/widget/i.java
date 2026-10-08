package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import j6.z;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i implements z {
    private static CharSequence b(Context context, ClipData.Item item, int i15) {
        if ((i15 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // j6.z
    public j6.d a(View view, j6.d dVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(dVar);
        }
        if (dVar.d() == 2) {
            return dVar;
        }
        ClipData clipDataB = dVar.b();
        int iC = dVar.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z15 = false;
        for (int i15 = 0; i15 < clipDataB.getItemCount(); i15++) {
            CharSequence charSequenceB = b(context, clipDataB.getItemAt(i15), iC);
            if (charSequenceB != null) {
                if (z15) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z15 = true;
                }
            }
        }
        return null;
    }
}

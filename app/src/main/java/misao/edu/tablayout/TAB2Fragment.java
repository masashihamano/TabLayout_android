package misao.edu.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by masashihamano on 2018/02/15.
 */

public class TAB2Fragment extends Fragment implements View.OnClickListener {

    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment2_layout,container,false );

        button = view.findViewById( R.id.btnTest );

        button.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {

        Toast.makeText( getActivity(), "Testing Button 2 Clicked", Toast.LENGTH_SHORT ).show();
    }
}

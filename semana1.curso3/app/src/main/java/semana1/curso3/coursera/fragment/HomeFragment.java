package semana1.curso3.coursera.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import semana1.curso3.coursera.R;
import semana1.curso3.coursera.adapter.PetAdapter;
import semana1.curso3.coursera.pojo.Pet;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView rv_pet;

    private ArrayList<Pet> pets;
    private PetAdapter petAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rv_pet = (RecyclerView) view.findViewById(R.id.rv_pet);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_pet.setLayoutManager(linearLayoutManager);
        pets = new ArrayList<Pet>();
        pets.add(new Pet(R.drawable.pet_one, "Ruffo", 0));
        pets.add(new Pet(R.drawable.pet_two, "Noli", 0));
        pets.add(new Pet(R.drawable.pet_three, "Roy", 0));
        pets.add(new Pet(R.drawable.pet_four, "Lazy", 0));
        pets.add(new Pet(R.drawable.pet_five, "Nino", 0));
        pets.add(new Pet(R.drawable.pet_six, "Cobo", 0));
        pets.add(new Pet(R.drawable.pet_seven, "Dino", 0));
        pets.add(new Pet(R.drawable.pet_eight, "Chumi", 0));
        petAdapter = new PetAdapter(getActivity(), pets);
        rv_pet.setAdapter(petAdapter);
        return view;
    }

}